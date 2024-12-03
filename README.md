<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Phòng Gym - Đăng nhập & Đăng ký</title>
  <style>
    body { font-family: Arial, sans-serif; text-align: center; padding: 20px; }
    form { margin: 20px auto; max-width: 400px; background: #f9f9f9; padding: 20px; border-radius: 8px; }
    input { width: 90%; padding: 10px; margin: 10px 0; border: 1px solid #ccc; border-radius: 4px; }
    button { padding: 10px 20px; background: #007bff; color: white; border: none; border-radius: 4px; }
    button:hover { background: #0056b3; }
  </style>
</head>
<body>
  <h1>Hệ Thống Quản Lý Phòng Gym</h1>

  <form id="loginForm">
    <h2>Đăng Nhập</h2>
    <input type="email" id="loginEmail" placeholder="Email" required />
    <input type="password" id="loginPassword" placeholder="Mật khẩu" required />
    <button type="submit">Đăng Nhập</button>
  </form>

  <form id="registerForm">
    <h2>Đăng Ký</h2>
    <input type="text" id="registerName" placeholder="Họ và tên" required />
    <input type="email" id="registerEmail" placeholder="Email" required />
    <input type="password" id="registerPassword" placeholder="Mật khẩu" required />
    <button type="submit">Đăng Ký</button>
  </form>

  <script>
    document.getElementById("loginForm").onsubmit = async (e) => {
      e.preventDefault();
      const email = document.getElementById("loginEmail").value;
      const password = document.getElementById("loginPassword").value;

      const response = await fetch('/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ email, password })
      });

      const data = await response.json();
      alert(data.message);
    };

    document.getElementById("registerForm").onsubmit = async (e) => {
      e.preventDefault();
      const name = document.getElementById("registerName").value;
      const email = document.getElementById("registerEmail").value;
      const password = document.getElementById("registerPassword").value;

      const response = await fetch('/register', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name, email, password })
      });

      const data = await response.json();
      alert(data.message);
    };
  </script>
</body>
</html>
