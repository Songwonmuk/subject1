/**
 * 
 */
 function deleteOrder(n){
	if (confirm('정말 삭제하시겠습니까?')) {
			location.href = "delete?order_num=" + n;
		}
}