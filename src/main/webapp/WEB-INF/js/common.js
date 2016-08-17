/**
 * 订单状态
 */ 
var orderStatus = {
 	WAIT_BACKGROUND_APPROVAL : "待审批",//等待后台审批 用户提交订单后的状态， 当前节点由后台管理（我们平台的工作人员）进行第一轮审批，审批完成后信贷经理才可以抢单
 	CREDIT_MANAGER_GRAB : "待抢单",//信贷经理抢单 当前节点信贷经理可以抢单
 	CREDIT_MANAGER_APPROVAL : "已抢单",//信贷经理审批中 当前节点信贷经理已抢到单
 	SUPPLEMENT_DATA : "补件中",//补件中 由信贷经理或机构发起的补件 由信贷经理与客户联系，要求客户补件
 	ORGANIZATION_APPROVAL : "机构审批中",//机构审批 机构正在进行审批
 	PASS : "审批通过",//审批通过 机构审批通过 
 	NO_PASS : "审批不通过",//不通过 机构审批不通过
 	CANCEL_REQUET : "已取消",//取消申请 客户取消申请
 	DRAFT : "资料待上传",//草稿
 	REJECT : "驳回",
 	getStatusText : function(name){
 		if(name == "WAIT_BACKGROUND_APPROVAL"){
 			return this.WAIT_BACKGROUND_APPROVAL;
 		}else if(name == "CREDIT_MANAGER_GRAB"){
 			return this.CREDIT_MANAGER_GRAB;
 		}else if(name == "CREDIT_MANAGER_APPROVAL"){
 			return this.CREDIT_MANAGER_APPROVAL;
 		}else if(name == "SUPPLEMENT_DATA"){
 			return this.SUPPLEMENT_DATA;
 		}else if(name == "ORGANIZATION_APPROVAL"){
 			return this.ORGANIZATION_APPROVAL;
 		}else if(name == "PASS"){
 			return this.PASS;
 		}else if(name == "NO_PASS"){
 			return this.NO_PASS;
 		}else if(name == "CANCEL_REQUET"){
 			return this.CANCEL_REQUET;
 		}else if(name == "DRAFT"){
 			return this.DRAFT;
 		}else if(name == "REJECT"){
 			return this.REJECT;
 		}else{
 			return "";
 		}
 	}
 };
