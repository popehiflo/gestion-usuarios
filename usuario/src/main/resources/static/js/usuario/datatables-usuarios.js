// Call the dataTables jQuery plugin
$(document).ready(function () {
    cargarUsuarios();
    $('#dataTableUsuarios').DataTable();
});

async function cargarUsuarios() {

    const requestUsuarios = await fetch('usuario/103', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    const usuarios = await requestUsuarios.json();

    console.log(usuarios);
}