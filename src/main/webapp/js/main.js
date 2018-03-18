{
    "use strict";

    const numberOfItems = document.querySelectorAll("nav li").length;

    let li_num_for_margin;

    switch (numberOfItems) {
        case 4:
            li_num_for_margin = 3;
            break;
        case 6:
            li_num_for_margin = 5;
            break;
    }

    document.querySelector(`li:nth-of-type(${li_num_for_margin})`).style["margin-left"] = "auto";

}


