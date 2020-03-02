<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="South African Tax Calculato">
  <meta name="author" content="Lungelo Qwabe">

  <title>South African Tax Calculator</title>

  <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style>
html, body{
    margin: 0px;
    padding: 0px;
    min-height: 100%;
    height: 100%;
}
#footer{
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
}
</style>
</head>

<body id="page-top">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <div class="container">
 <a class="navbar-brand " href="#page-top"><b>PSIber</b> </a>      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link " href="#about">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="#services">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="#contact">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <header class="bg-primary text-white">
    <div class="container text-center">
      <h1>.</h1>
      <p class="lead"><b>SA Tax Calculator</b></p>
    </div>
  </header>

  <section id="about">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 mx-auto">
          <h2></h2>
          <p class="lead"></p>
          <div class="container">
            <h4>Tax Calculator</h4>
             <form method="post" action="/calculate-tax" modelAttribute="taxDto" name="taxForm">
                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label">Age</label>
                    <input type="number" class="col-md-4 form-control" name="age" value=${age} placeholder="16" required="required">
                </div>

                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label">Tax Year</label>
                    <select name="taxYear" class="col-md-4 form-control" value=${taxYear} required="required">
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                    </select>
                </div>

                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label">Total Taxable Earnings</label>
                    <div class="input-group-prepend">
                        <span class="input-group-text">R</span>
                    </div>
                    <input type="number" class="col-md-4 form-control" name="earnings" value=${earnings} placeholder="16" required="required">
                </div>

                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label">Earnings Frequency</label>
                    <select name="payFreq" class="col-md-4 form-control" value=${payFreq} required="required" >
                        <option value="Monthly">Monthly</option>
                        <option value="Annually">Annually</option>
                    </select>
                </div>

                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label">No. of Beneficiaries (incl. Main Member)</label>
                    <input type="number" class="col-md-4 form-control" name="medicalAid" value=${medicalAid}  placeholder="0" width="50">
                </div>

                <div class="row input-group mb-3">
                    <label class="col-md-4 col-form-label"> Thus Monthly Tax </label>
                    <div class="input-group-prepend">
                    <span class="input-group-text"><b> R ${results}</b></span>
                    </div>
                </div>
                    <input type="submit" value="Submit">
            </form>
          </div>
        </div>
      </div>
    </div>
  </section>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp</p>
<!-- Footer -->
  <footer class="py-3 bg-dark" id="footer">
    <div class="container" id="footer-content">
      <p class="m-0 text-center text-white">Copyright &copy; PSIber 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- JavaScript -->

  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
          integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
          crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
          integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
          crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
          integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
          crossorigin="anonymous"></script>

</body>

</html>