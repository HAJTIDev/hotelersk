<!DOCTYPE html><html lang="pl">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bootstrap Alerts Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    .color-rise {
      animation: rise 3s infinite alternate ease-in-out;
    }
    @keyframes rise {
      from {
        transform: translateY(20px);
      }
      to {
        transform: translateY(0px);
      }
    }
  </style>
</head>
<body class="bg-light p-4"><div class="container">
  <div class="row">
    <div class="col-md-4 text-center">
      <img src="flower1.jpg" class="img-fluid mb-3" alt="kwiat">
      <img src="flower2.jpg" class="img-fluid mb-3" alt="kwiat">
    </div><div class="col-md-4">
  <img src="tulip.jpg" class="img-fluid mb-4" alt="tulipan">

  <div class="alert alert-success color-rise">Success! Ten alert oznacza pomyślną operację.</div>
  <div class="alert alert-info color-rise">Info! Ten alert zawiera informację dodatkową.</div>
  <div class="alert alert-warning color-rise">Warning! Ostrzeżenie o możliwym ryzyku.</div>
  <div class="alert alert-danger color-rise">Danger! Coś poszło nie tak.</div>

  <div class="alert alert-primary color-rise">Primary — ważna akcja!</div>
  <div class="alert alert-secondary color-rise">Secondary — mniej ważne info.</div>
  <div class="alert alert-light color-rise">Light — jasny alert.</div>
  <div class="alert alert-dark color-rise">Dark — ciemny alert.</div>
</div>

<div class="col-md-4">
  <table class="table table-bordered text-center">
    <thead class="table-light">
      <tr>
        <th>Towar</th>
        <th>Ilość</th>
        <th>Cena</th>
      </tr>
    </thead>
    <tbody>
      <tr class="table-success"><td>Grażki</td><td>20</td><td>2 zł</td></tr>
      <tr class="table-info"><td>Jabłka</td><td>10 kg</td><td>5 zł/kg</td></tr>
      <tr class="table-warning"><td>Śliwki</td><td>1 kg</td><td>7 zł/kg</td></tr>
      <tr class="table-danger"><td>Arbuzy</td><td>20 kg</td><td>2 zł/kg</td></tr>
      <tr class="table-primary"><td>Pomarańcze</td><td>20 szt.</td><td>3 zł/szt.</td></tr>
    </tbody>
  </table>
</div>

  </div>
</div><script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script></body>
</html>