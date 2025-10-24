<!doctype html>

<html lang="pl">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Demo Bootstrap — Prosta strona</title>
  <!-- Bootstrap 5 CSS (CDN) -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { padding-top: 70px; }
    .demo-section { padding: 2rem 0; }
  </style>
</head>
<body><!-- Navbar --><nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Bootstrap Demo</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navMenu">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navMenu">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link active" href="#grid">Grid</a></li>
        <li class="nav-item"><a class="nav-link" href="#cards">Cards</a></li>
        <li class="nav-item"><a class="nav-link" href="#forms">Form</a></li>
      </ul>
    </div>
  </div>
</nav><div class="container">  <!-- Hero -->  <header class="text-center my-4">
    <h1>Demo możliwości Bootstrap 5</h1>
    <p class="lead">Kilka podstawowych komponentów i przykładów układu.</p>
  </header>  <!-- Grid -->  <section id="grid" class="demo-section">
    <h2>Grid (siatka)</h2>
    <p>Przykład responsywnego układu kolumn.</p>
    <div class="row">
      <div class="col-12 col-md-6 col-lg-4 mb-3">
        <div class="p-3 border bg-light">.col-12 .col-md-6 .col-lg-4</div>
      </div>
      <div class="col-12 col-md-6 col-lg-4 mb-3">
        <div class="p-3 border bg-light">.col-12 .col-md-6 .col-lg-4</div>
      </div>
      <div class="col-12 col-md-12 col-lg-4 mb-3">
        <div class="p-3 border bg-light">.col-12 .col-md-12 .col-lg-4</div>
      </div>
    </div>
  </section>  <!-- Cards -->  <section id="cards" class="demo-section">
    <h2>Karty (Cards)</h2>
    <div class="row">
      <div class="col-md-6 col-lg-4 mb-4">
        <div class="card h-100">
          <img src="https://picsum.photos/600/300?random=1" class="card-img-top" alt="Obrazek">
          <div class="card-body">
            <h5 class="card-title">Karta 1</h5>
            <p class="card-text">Prosty opis karty. Możesz użyć kart do prezentacji treści.</p>
            <a href="#" class="btn btn-primary">Akcja</a>
          </div>
        </div>
      </div>
      <div class="col-md-6 col-lg-4 mb-4">
        <div class="card h-100">
          <div class="card-body">
            <h5 class="card-title">Lista i odznaki</h5>
            <p class="card-text">Bootstrap ma również odznaki, listy i wiele pomocniczych klas.</p>
            <span class="badge bg-success">Nowe</span>
            <span class="badge bg-secondary">Beta</span>
          </div>
        </div>
      </div>
      <div class="col-md-12 col-lg-4 mb-4">
        <div class="card h-100">
          <div class="card-body">
            <h5 class="card-title">Alerty i przyciski</h5>
            <p class="card-text">Przykładowy alert poniżej.</p>
            <div class="alert alert-warning" role="alert">To jest ostrzeżenie.</div>
            <button class="btn btn-outline-danger me-2" data-bs-toggle="modal" data-bs-target="#exampleModal">Pokaż modal</button>
            <button class="btn btn-outline-primary" data-bs-toggle="collapse" data-bs-target="#extraInfo">Pokaż/ukryj</button>
            <div class="collapse mt-2" id="extraInfo">Dodatkowe informacje w elemencie collapse.</div>
          </div>
        </div>
      </div>
    </div>
  </section>  <!-- Forms -->  <section id="forms" class="demo-section">
    <h2>Formularz</h2>
    <form>
      <div class="mb-3">
        <label for="inputEmail" class="form-label">Email</label>
        <input type="email" class="form-control" id="inputEmail" placeholder="name@example.com">
      </div>
      <div class="mb-3">
        <label for="selectExample" class="form-label">Przykładowy wybór</label>
        <select id="selectExample" class="form-select">
          <option>Opcja 1</option>
          <option>Opcja 2</option>
        </select>
      </div>
      <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="checkMe">
        <label class="form-check-label" for="checkMe">Zapamiętaj mnie</label>
      </div>
      <button type="submit" class="btn btn-success">Wyślij</button>
    </form>
  </section>  <!-- Carousel -->  <section class="demo-section">
    <h2>Karuzela (Carousel)</h2>
    <div id="demoCarousel" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="https://picsum.photos/1200/400?random=10" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="https://picsum.photos/1200/400?random=11" class="d-block w-100" alt="...">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#demoCarousel" data-bs-slide="prev">
        <span class="carousel-control-prev-icon"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#demoCarousel" data-bs-slide="next">
        <span class="carousel-control-next-icon"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </section></div><!-- Modal --><div class="modal fade" id="exampleModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Przykładowy modal</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>
      <div class="modal-body">To jest treść modalu.</div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Zamknij</button>
        <button type="button" class="btn btn-primary">Zapisz zmiany</button>
      </div>
    </div>
  </div>
</div><!-- Bootstrap JS (Popper included) --><script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script><script>
  // Włącz tooltipy
  const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
  tooltipTriggerList.forEach(function (el) {
    new bootstrap.Tooltip(el)
  })
</script></body>
</html>