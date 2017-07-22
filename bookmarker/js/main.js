document.getElementById('myForm').addEventListener('submit',saveBookmark);


function saveBookmark(e) {
    //value is used to display value on console
    var siteName = document.getElementById('siteName').value;
    var siteUrl = document.getElementById('siteUrl').value;
    if(!validateForm(siteName,siteUrl))
    {
        return false;
    }
    //object
    var bookmark = {
        name: siteName,
        url: siteUrl
    }


    //test if bookmarks is null
    if (localStorage.getItem('bookmarks') === null) {   //init bookmarks
        var bookmarks = [];
        bookmarks.push(bookmark);
        //set to loacl storage
        localStorage.setItem('bookmarks', JSON.stringify(bookmarks));
    }
    else {
        //get bookmark from local storage
        var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));
        //add bookmark to array
        bookmarks.push(bookmark);
        bookmarks.push(bookmark);
        //re-set to local storage
        localStorage.setItem('bookmarks', JSON.stringify(bookmarks));


    }
    document.getElementById('myForm').reset();
    fetchBookmark();
    e.preventDefault();
}
//delete bookmark
function deleteBookmark(url)
{
    var bookmarks= JSON.parse(localStorage.getItem('bookmarks'));
    for(var i=0;i<bookmarks.length;i++)
    {
        if(bookmarks[i].url==url)
        {
            bookmarks.splice(i,1);
        }
    }
    localStorage.setItem('bookmarks', JSON.stringify(bookmarks));
    //re-fetch bookmarks
    fetchBookmark();

}
    //fetch bookmark
    function fetchBookmark(){
        var bookmarks= JSON.parse(localStorage.getItem('bookmarks'));
        //get output id
        var bookmarksResult=document.getElementById('bookmarksResult');
        //output
        bookmarksResult.innerHTML='';
        for(var i=0;i<bookmarks.length;i++) {
            var name = bookmarks[i].name;
            var url = bookmarks[i].url;

            bookmarksResult.innerHTML += '<div class="well">' +
                '<h3>' + name +
                '<a class="btn btn-default" target="_blank" href="' + url + '">Visit</a>' +
                '<a onclick="deleteBookmark(\'' + url + '\')" class="btn btn-danger" href="#">Delete</a>' +
                '</h3>' +
                '</div>';

        }

    }
     function validateForm(siteName, siteUrl)
     {
         if(!siteName|| !siteUrl){
             alert('please fill in the form');
             return false;
         }
         var expression = /[-a-zA-Z0-9@:%_\+.~#?&//=]{2,256}\.[a-z]{2,4}\b(\/[-a-zA-Z0-9@:%_\+.~#?&//=]*)?/gi;
         var regex = new RegExp(expression);
         if(!siteUrl.match(regex)){
             alert('Please use a valid url');
             return false;
         }
         return true;
     }

