const app = Vue.createApp({
    data(){
        return{
            message:'hello websocket',
            id:'1',
            content:'',
            ws: null
        }
    },
    methods:{
        open(){
            console.log("open")
            this.ws = new WebSocket(`ws://localhost:8089/socket/${this.id}`)

            this.ws.onopen =()=>{
                console.log("websocket 连接成功")
            }
            this.ws.onclose =()=>{
                console.log("websocket 已经关闭")
            }
            this.ws.onerror =(e)=>{
                console.log("websocket 出现异常")
                console.log(e)
            }
            this.ws.onmessage =(res) =>{
                console.log(res)
                this.message = this.message.concat(res.data)
            }
        },
        send(){
            console.log("sendMsg")
            this.ws.send(this.content)
            this.content=' '
        }
    }
    })