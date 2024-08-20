<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style><%@include file="../../css/style.css"%></style>
</head>
<body>
    <div class="container-home">
        <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="home">Online Quiz App</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/scores">Scoreboard</a>
                  </li>
                </ul>
              </div>
              <div class="logout-button">
                <div class="user-name">
                    <h4><i class="bi bi-person-square me-2"></i>${name}!</h4>
                </div>
                <div class="btn btn-warning">
                    <a href="/logout" style="color: black; text-decoration: none;">Logout</a>
                </div>
              </div>
            </div>
          </nav>

        <!-- General Knowledge Quiz -->
        <main>
            <div class="ms-5 mt-5" style="display: flex; gap: 5%;">
                <a href="/gkQuiz" style="text-decoration: none;">
                    <div class="card" style="width: 22rem;">
                        <img src="./images/Your-paragraph-text.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">General Knowledge</h5>
                            <p class="card-text">General knowledge is information that has been accumulated over time through various media and sources.</p>
                        </div>
                    </div>
                </a>
                <a href="/scienceQuiz" style="text-decoration: none;">
                    <div class="card" style="width: 22rem;">
                        <img src="./images/science.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Science</h5>
                            <p class="card-text">Science is a rigorous, systematic endeavor that builds and organizes knowledge in the form of testable explanations.</p>
                        </div>
                    </div>
                </a>
                <a href="/sportsQuiz" style="text-decoration: none;">
                    <div class="card" style="width: 22rem;">
                        <img src="./images/sports.jpg" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Sports</h5>
                            <p class="card-text">Sport covers a range of activities performed and undertaken as part of leisure or competition.</p>
                        </div>
                    </div>
                </a>
            </div>
        </main>
    </div>
</body>
</html>