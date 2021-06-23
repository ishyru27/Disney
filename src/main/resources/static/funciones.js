function eliminar(id){
    swal({
  title: "Esta seguro de Eliminar?",
  text: "Una vez eliminado, ¡no podrá recuperar este archivo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
      $.ajax({
      url:"/delete/"+id_personaje,
        success: function(res){
            console.log(res);
            
        }
      });
    swal("Tu archivo ha sido eliminado!!", {
      icon: "success",
    }).then((ok)=>{ 
        if(ok){
            location.href="/characters";
        }
    });
  } else {
    swal("Tu archivo no ha sido eliminado!");
  }
});
    
    
}
