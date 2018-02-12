/**
 * 行政区域js
 */

$(function () {
    initialPage();
    getGrid();
    getAppInfo();
});

function initialPage() {
    $("#treePanel").css('height', $(window).height() - 54);
    $(window).resize(function () {
        $("#treePanel").css('height', $(window).height() - 54);
        $('#dataGrid').bootstrapTable('resetView', {
            height: $(window).height() - 108
        });
    });
}

function getGrid() {
    $('#dataGrid').bootstrapTableEx({
        url: '../../userManager/userList?_' + $.now(),
        height: $(window).height() - 108,
        queryParams: function (params) {
            params.name = vm.keyword;
            params.parentCode = vm.parentCode;
            return params;
        },
        pagination: false,
        columns: [{
            title: '头像',
            field: 'headimgurl',
            align : "center",
            valign: 'middle',
            formatter : function(value, row, index) {
                return '<img src='+value+' style="width: 50px;"/>';
            }
        }, {
            field: "nickname",
            title: "用户昵称",
            align : "center",
            valign: 'middle'
        },{
            title: '性别',
            field: 'sex',
            align : "center",
            valign: 'middle',
            formatter : function(value, row, index) {
                if (value == 1) {
                    return '<span>男性</span>';
                }
                if (value == 0) {
                    return '<span>女性</span>';
                }
            }
        }, {
            field: "country",
            title: "所在国家",
            valign: 'middle',
            align : "center"
        }, {
            field: "province",
            title: "所在省份",
            valign: 'middle',
            align : "center"
        }, {
            field: "city",
            title: "所在城市",
            valign: 'middle',
            align : "center"
        }, {
            field: "subscribe_time",
            title: "关注时间",
            valign: 'middle',
            align : "center",
            formatter : function(value, row, index) {
                return '<span>'+new Date(value*1000).toLocaleString(); +'</span>';
            }
        }, {
            field: "remark",
            title: "备注",
            valign: 'middle',
            align : "center"
        }]
    })
}
function getAppInfo() {
    $.SetForm({
        url: '../../userManager/getAppInfo?_' + $.now(),
        param: "",
        success: function(data) {
            $("#appid").attr("placeholder",data.appid);
            $("#secret").attr("placeholder",data.appsecret)
        }
    });
}


var vm = new Vue({
    el: '#eyluoye',
    data: {
        keyword: null,
        parentCode: '0',
        parentName: null
    },
    methods: {
        resetAppInfo: function () {
            var appid =  $("#appid").val();
            var secret = $("#secret").val();
            if(appid == ""){
                dialogMsg("appid不能为空");
                return;
            }
            if(secret == ""){
                dialogMsg("appsecret不能为空");
                return;
            }
            $.SetForm({
                url: '../../userManager/resetAppInfo?_' + $.now(),
                param: {"appid":appid,"secret":secret},
                success: function(data) {
                    vm.load();
                    getGrid();
                    dialogMsg(data,'success');
                }
            });
        },
        load: function () {
            $('#dataGrid').bootstrapTable('refresh');
        },
    },
    created: function () {
       // this.getArea(this.parentCode);
    }
})