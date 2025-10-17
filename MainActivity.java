<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Project: Interactive slideshow</title>
  
  <!-- Bootstrap dla lepszego wyglądu -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
  
  <style>
    body {
      background-color: #f7f9fc;
      text-align: center;
      padding: 30px;
      font-family: 'Segoe UI', sans-serif;
    }
    #slideshow {
      position: relative;
      width: 400px;
      margin: 0 auto;
    }
    #slideshow img {
      width: 100%;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.2);
      display: none;
    }
    #caption {
      margin-top: 10px;
      font-style: italic;
      color: #555;
    }
    .btn {
      margin: 10px;
    }
  </style>
</head>

<body>

  <h2>🌄 Interaktywny Pokaz Slajdów</h2>

  <div id="slideshow">
    <img src="https://www.kasandbox.org/programming-images/food/mushroom.png" alt="Mushrooms" data-caption="Smaczne grzyby w lesie" loading="lazy">
    <img src="https://www.kasandbox.org/programming-images/food/tomatoes.png" alt="Tomatoes" data-caption="Świeże pomidory z ogródka" loading="lazy">
    <img src="https://www.kasandbox.org/programming-images/food/berries.png" alt="Berries" data-caption="Słodkie jagody" loading="lazy">
    <img src="https://www.kasandbox.org/programming-images/food/dumplings.png" alt="Dumplings" data-caption="Pyszne pierożki" loading="lazy">
  </div>

  <div>
    <button id="prev" class="btn btn-outline-primary">⬅ Prev</button>
    <button id="next" class="btn btn-primary">Next ➡</button>
  </div>

  <p id="caption"></p>

  <!-- jQuery -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

  <script>
    $(document).ready(function() {
      let current = 0; // numer aktualnego zdjęcia
      let images = $("#slideshow img");
      let caption = $("#caption");

     
      $(images[current]).fadeIn();
      caption.text($(images[current]).data("caption"));

  
      function showSlide(index) {
        $(images[current]).fadeOut(400, function() {
          current = (index + images.length) % images.length;
          $(images[current]).fadeIn(400);
          caption.text($(images[current]).data("caption"));
        });
      }

      $("#next").click(function() {
        showSlide(current + 1);
      });

      $("#prev").click(function() {
        showSlide(current - 1);
      });
    });
  </script>

</body>
</html>