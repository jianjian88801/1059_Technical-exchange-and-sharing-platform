const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot1o52x/",
            name: "springboot1o52x",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot1o52x/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "IT技术交流和分享平台"
        } 
    }
}
export default base
