$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9090/greeting"
    }).then(function(data) {
        $('.greeting-id').append(data.greetingId);
        $('.greeting-content').append(data.greeting);
    });
});