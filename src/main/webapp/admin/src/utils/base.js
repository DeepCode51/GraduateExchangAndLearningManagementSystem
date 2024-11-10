const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmg1el1/",
            name: "ssmg1el1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmg1el1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "毕业生交流学习平台"
        } 
    }
}
export default base
