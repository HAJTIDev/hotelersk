<!DOCTYPE html>
<html lang="pl">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bootstrap Demo</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4">

  <div class="container-fluid">
    <div class="row">
      <!-- LEWA KOLUMNA -->
      <div class="col-md-4">
        <h1>Lorem ipsum</h1>
        <p class="text-muted">CKXAU</p>
        <p>dolor sit amet, <strong>consectetur adipiscing elit.</strong></p>
        <p>Sed quis purus nec enim venenatis dapibus.</p>
        <p>Fusce <u>ut amet nulla</u> a libero ultricies <strong>vestibulum.</strong></p>
        <p>Vestibulum rutrum turpis feugiat.</p>
        <p><code>semper: facilisis, faucibus, elit.</code></p>
        <p><mark>Donec ullamcorper nisl</mark></p>
        <a href="#">lacinia posuere semper // link</a>

        <h6 class="mt-4">CURABITUR VITAE DAPIBUS DOLOR.</h6>
        <p class="small">
          Maecenas Rhoncus Suscipit Dui, in Luctus Risus Congue Id.
          Nulla facilisi. Sed Ligula Orci, Effictur Iu Tortor Cursus, Cursus Volutpat Arcu.
          Vestibulum Velit Nisi, Sagittis Vel Ipsum Non, Bibendum Mollis Mauris.
        </p>
      </div>

      <!-- ŚRODKOWA KOLUMNA -->
      <div class="col-md-4 text-center">
        <h1>Lorem ipsum</h1>
        <div class="my-3">
          <div class="bg-primary text-white p-2 mb-1"> </div>
          <div class="bg-success text-white p-2 mb-1"> </div>
          <div class="bg-info text-dark p-2 mb-1"> </div>
          <div class="bg-warning text-dark p-2 mb-1"> </div>
          <div class="bg-danger text-white p-2 mb-1"> </div>
          <div class="bg-secondary text-white p-2 mb-1"> </div>
          <div class="bg-dark text-white p-2 mb-1"> </div>
          <div class="bg-light text-dark p-2 mb-1"> </div>
        </div>
        <button class="btn btn-success">change color</button>
      </div>

      <!-- PRAWA KOLUMNA -->
      <div class="col-md-4">
        <h4>Background Color with Contrasting Text Color</h4>
        <p class="bg-primary text-white p-2">This text is important.</p>
        <p class="bg-success text-white p-2">This text indicates success.</p>
        <p class="bg-info text-dark p-2">This text represents some information.</p>
        <p class="bg-warning text-dark p-2">This text represents a warning.</p>
        <p class="bg-danger text-white p-2">This text represents danger.</p>
        <p class="bg-secondary text-white p-2">Secondary background color.</p>
        <p class="bg-dark text-white p-2">Dark grey background color.</p>
        <p class="bg-light text-dark p-2">Light grey background color.</p>
      </div>
    </div>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>