document.addEventListener("DOMContentLoaded", function () {
    var loginButton = document.querySelector('.btn.btn-outline-secondary[href="/login"]');
    var logoutButton = document.querySelector('.btn.btn-outline-secondary[href="/login/logout"]');
    
    if (isLoggedIn) {
        // 로그인한 경우, 로그인 버튼 숨기고 로그아웃 버튼 표시
        if (loginButton) {
            loginButton.style.display = 'none';
        }
        if (logoutButton) {
            logoutButton.style.display = 'block';
        }
    } else {
        // 로그인하지 않은 경우, 로그아웃 버튼 숨기고 로그인 버튼 표시
        if (logoutButton) {
            logoutButton.style.display = 'none';
        }
        if (loginButton) {
            loginButton.style.display = 'block';
        }
    }
});