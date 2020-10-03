function eliminar(id){
   swal({
  title: "Quiere eliminar este dato?",
//  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
  if (willDelete) {
      
    $.ajax({
                        url: "/eliminar/"+id,
                        success: function(resp){
                            
                        }
    })
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((ok)=>{
        if(ok){
            location.href = "/";
        }
    })
  } else {
//    swal("Your imaginary file is safe!");
  }
});
}
