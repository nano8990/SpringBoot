function changeRegionId() {
	var inputRegionId = '<input type="text" name="region_id" onChange="changeRegionId()" placeholder="REGIONID" /><br />';
	var inputList = [];
	var inputLength = $('input[name=region_id]').length;
	for (var i = 0; i < inputLength; i++) {
		inputList.push($('input[name=region_id]:eq(' + i + ')').val());
	}
	if (inputList.includes('')) {
		spanString = '';
		for (var i = 0; i < inputLength; i++) {
			var eachInput = inputList[i];
			if (eachInput != '') {
				spanString += '<input type="text" name="region_id" onChange="changeRegionId()" placeholder="REGIONID" value="' + eachInput + '" /><br />';
			}
		}
		spanString += inputRegionId;
		$('#spanRegionId').html(spanString);
	} else {
		$('#spanRegionId').append(inputRegionId);
	}
}

function changeProduct() {
	var inputProduct = '<input type="text" name="product" onChange="changeProduct()" placeholder="PRODUCT" /><br />';
	var inputList = [];
	var inputLength = $('input[name=product]').length;
	for (var i = 0; i < inputLength; i++) {
		inputList.push($('input[name=product]:eq(' + i + ')').val());
	}
	if (inputList.includes('')) {
		spanString = '';
		for (var i = 0; i < inputLength; i++) {
			var eachInput = inputList[i];
			if (eachInput != '') {
				spanString += '<input type="text" name="product" onChange="changeProduct()" placeholder="PRODUCT" value="' + eachInput + '" /><br />';
			}
		}
		spanString += inputProduct;
		$('#spanProduct').html(spanString);
	} else {
		$('#spanProduct').append(inputProduct);
	}
}