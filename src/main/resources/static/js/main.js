/// <reference path="../../../../../typings/globals/jquery/index.d.ts" />
$(document).ready(function(){
    $('.container .nBtn, .table .eBtn').on('click', function(event){
        event.preventDefault();
        $(".myForm #exampleModal").modal('show');
        var href = $(this).attr('href');
        var text = $(this).text();
        if (text == 'Edit') {
            $.get(href, function(country, status){
                $('.myForm #id').val(country.id);
                $('.myForm #name').val(country.name);
                $('.myForm #capital').val(country.capital);
            });
        } else {
            $('.myForm #id').val('');
            $('.myForm #name').val('');
            $('.myForm #capital').val('');
        }
    });
    $('.table .dBtn').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $("#myModal").modal('show');
    });  
});