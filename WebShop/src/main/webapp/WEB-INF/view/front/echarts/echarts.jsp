<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>${webTitle}</title>
<meta charset="utf-8">

<script>
	
<%--JS gloable varilible--%>
	var basePath = "${base}";
</script>


<link rel="stylesheet"
	href="${base}/static/common/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${base}/static/common/css/no-responsive.css">

<script src="${base}/static/common/js/jquery-2.0.0.min.js"></script>
<script src="${base}/static/common/js/bootstrap.min.js"></script>
<script src="${base}/static/common/js/imagesloaded.pkgd.js"></script>
<script src="${base}/static/common/js/masonry.pkgd.min.js"></script>
<script src="${base}/static/common/js/echarts.min.js"></script>
<link href="${base}/static/front/css/index/index.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="${base}/static/front/js/index/index.js"></script>
<style type="text/css">
.thumbnail {
	padding: 0px !important;
}

.hover-div {
	text-align: center !important;
	background-color: #E95420;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/layout/web/navbar.jsp"></jsp:include>

 <div id="main" style="width: 600px;height:400px;"></div>
	 <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据

        
   $.get(basePath+"/echartAjax",function(data,status){
	   
	   console.log(data);
	   // 使用刚指定的配置项和数据显示图表。
       myChart.setOption({
           title : {
               text: data[0]['name'],
               subtext: '纯属虚构',
               x:'center'
           },
           tooltip : {
               trigger: 'item',
               formatter: "{a} <br/>{b} : {c} ({d}%)"
           },
           legend: {
               orient : 'vertical',
               x : 'left',
               data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
           },
           toolbox: {
               show : true,
               feature : {
                   mark : {show: true},
                   dataView : {show: true, readOnly: false},
                   magicType : {
                       show: true, 
                       type: ['pie', 'funnel'],
                       option: {
                           funnel: {
                               x: '25%',
                               width: '50%',
                               funnelAlign: 'left',
                               max: 1548
                           }
                       }
                   },
                   restore : {show: true},
                   saveAsImage : {show: true}
               }
           },
           calculable : true,
           series : [
               {
                   name:'访问来源',
                   type:'pie',
                   radius : '55%',
                   center: ['50%', '60%'],
                   data:data
               }
           ]
       });
	    
	    
	  });
        
     
	</script>
	<jsp:include page="/WEB-INF/layout/web/footer.jsp" />
</body>
</html>