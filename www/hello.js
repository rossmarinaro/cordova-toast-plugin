

const onFail = err => alert('plugin failed' + err);

exports.showToast = json => cordova.exec(null, onFail, 'hello', 'showToast', json);


