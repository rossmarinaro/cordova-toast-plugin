

exports.showToast = json => cordova.exec(null, err => alert('plugin failed' + err), 'toasty', 'showToast', json);


