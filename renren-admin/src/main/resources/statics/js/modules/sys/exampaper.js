$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/exampaper/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '区域名称', name: 'areaId', index: 'area_id', width: 80 },
			{ label: '种类名称', name: 'catalogId', index: 'catalog_id', width: 80 },
			{ label: '试卷名称', name: 'name', index: 'name', width: 80 }, 			
			{ label: '时长', name: 'duration', index: 'duration', width: 80 }, 			
			{ label: '分值', name: 'score', index: 'score', width: 80 }, 			
			{ label: '考试类型', name: 'closed', index: 'closed', width: 80 },
			{ label: '描述', name: 'descr', index: 'descr', width: 80 }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		examPaper: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.examPaper = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.examPaper.id == null ? "sys/exampaper/save" : "sys/exampaper/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.examPaper),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "sys/exampaper/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "sys/exampaper/info/"+id, function(r){
                vm.examPaper = r.examPaper;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		},
		addPaper: function(event){
            parent.layerOpen({title:'新增试卷',
                btn: ['保存','取消'],
                closeBtn:1,
                btn1Callback:function(){console.log("but10")},
                btn2Callback:function(){console.log("but2...");}
                ,content:"modules/sys/exam_new_paper.html"
                ,area:['1024px','650px']
                ,type:2
            });
        }
	}
});