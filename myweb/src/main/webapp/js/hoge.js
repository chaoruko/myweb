/*
http://d.hatena.ne.jp/jawssame7/20091014/1255477312#
・非同期通信のレスポンスが帰ってきたときに、データ形式を判定（JSON形式かどうか）。
・JSON形式のデータからvalidationのメッセージを取得して、入力チェック等のあった部品の横に
　メッセージを表示。（saveErrorsメソッドを使用する場合には、divのidがerrorsの箇所に表示される。）
非同期通信完了時のファンクションを設定。
 */

$(function() {
    $.ajaxSetup({
                timeout : 180000,
		cache: false,
		complete : onAjaxComplete
		});
});

/**
 * ajax通信完了時の処理
 * @param xmlRequest
 * @param textStatus
 * @return
 */
function onAjaxComplete(xmlRequest, textStatus) {
	if (isJsonData(xmlRequest)) {
		processJson($.httpData(xmlRequest, 'json'),  textStatus);
	} else {
		if ($("td").is("#main")) {
			$("#main").html(xmlRequest.responseText);
		} else {
			$("body").html(xmlRequest.responseText);
		}
	}
}

/**
* form送信後のデータがJSON形式だった場合の処理
* @param data
* @param status
* @return
*/
function processJson(data, status) {
    // validate error の場合
    if (data.status == 'validate') {
		var allInput = $(':input');  // input 要素取得
		var errors = data.errors;
                // プロパティの一致した箇所を探す。
		for (var cnt = 0; cnt < allInput.length; cnt++) {
			for (var cnt2 = 0; cnt2 < errors.length; cnt2++) {
				if (allInput[cnt].name != '' && allInput[cnt].name == errors[cnt2].name) {
					var id = allInput[cnt].name;
					$(allInput[cnt]).addClass('error');

                                        // プロパティの一致した箇所の部品の大きさを取得
					var targetTop = $(allInput[cnt]).offset().top;
					var targetLeft = $(allInput[cnt]).offset().left;
					var itemWidth = $(allInput[cnt]).outerWidth();
					var left = Math.floor(parseInt(targetLeft) + parseInt(itemWidth) + 10);

					var msg = '<div id="' + id + '"class="colorred bgFFFFFF">' + errors[cnt2].val + '</div>';

					$('body').append(msg);
					$('#' + id).css({float: 'left', position: 'absolute', top: targetTop, left: left});

				}


			}
		}
                // saveErrorsメソッドを使用した時
		for (var cnt = 0; cnt < errors.length; cnt++) {
			if (errors[cnt].name == '') {
				$('#errors').append('<div class="colorred bgFFFFFF">' + errors[cnt].val + '</div>');
			}
		}
}

/**
 * ajax通信後のデータ形式がJSONかどうかを判定します。
 * @param XMLHttpRequest
 * @return
 */
function isJsonData(XMLHttpRequest) {
	var contentType = XMLHttpRequest.getResponseHeader('Content-Type');
	if (contentType.indexOf("json") > -1) {
		return true;
	}
	return false;
}