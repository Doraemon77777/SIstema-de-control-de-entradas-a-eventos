
<div style="position: relative;">

  <!-- Imagen de fondo semi-transparente -->
  <img src="https://i.pinimg.com/originals/dd/f6/8b/ddf68b46196d37f56b067fe5fdc32c14.jpg"
       style="
         position: absolute;
         top: 0;
         left: 0;
         width: 100%;
         height: 100%;
         object-fit: cover;
         opacity: 0.15; /* <<< Ajusta aquí la transparencia */
         z-index: -1;
       ">

  <!-- Contenido encima -->
  <div style="position: relative; z-index: 1; padding: 20px;">
    <h1 align="center">Título del proyecto</h1>
    <p align="center">
      Este texto aparece encima del fondo con efecto suave.
    </p>

  </div>

</div>
