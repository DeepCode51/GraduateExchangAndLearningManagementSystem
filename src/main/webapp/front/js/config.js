
var projectName = '毕业生交流学习平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '文献资料',
	url: './pages/wenxianziliao/list.html'
}, 
{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.html'
}, 
{
	name: '考研资料',
	url: './pages/kaoyanziliao/list.html'
}, 
{
	name: '考公资料',
	url: './pages/kaogongziliao/list.html'
}, 

{
	name: '学习交流',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssmg1el1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"文献资料","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"简历投递","menuJump":"列表","tableName":"jianlitoudi"}],"menu":"简历投递管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"考研资料","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"考公资料","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学习交流","tableName":"forum"}],"menu":"学习交流"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"文献资料列表","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料模块"},{"child":[{"buttons":["查看","投递"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"buttons":["查看"],"menu":"考研资料列表","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料模块"},{"child":[{"buttons":["查看"],"menu":"考公资料列表","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","查看评论"],"menu":"文献资料","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料管理"},{"child":[{"buttons":["查看","投递"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看"],"menu":"简历投递","menuJump":"列表","tableName":"jianlitoudi"}],"menu":"简历投递管理"},{"child":[{"buttons":["新增","查看","查看评论"],"menu":"考研资料","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料管理"},{"child":[{"buttons":["新增","查看","查看评论"],"menu":"考公资料","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"文献资料列表","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料模块"},{"child":[{"buttons":["查看","投递"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"buttons":["查看"],"menu":"考研资料列表","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料模块"},{"child":[{"buttons":["查看"],"menu":"考公资料列表","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","审核","查看评论"],"menu":"文献资料","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["新增","查看","审核","查看评论"],"menu":"考研资料","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料管理"},{"child":[{"buttons":["新增","查看","查看评论","审核"],"menu":"考公资料","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"文献资料列表","menuJump":"列表","tableName":"wenxianziliao"}],"menu":"文献资料模块"},{"child":[{"buttons":["查看","投递"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"buttons":["查看"],"menu":"考研资料列表","menuJump":"列表","tableName":"kaoyanziliao"}],"menu":"考研资料模块"},{"child":[{"buttons":["查看"],"menu":"考公资料列表","menuJump":"列表","tableName":"kaogongziliao"}],"menu":"考公资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
