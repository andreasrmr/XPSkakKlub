### Repo Item ###
#create()
#INSERT INTO Items (itemName, itemDescription) VALUES ("name", "description");
#readOnId()
#SELECT itemId, itemName, itemDescription FROM Items WHERE itemId = 1;
#readAll()
#SELECT itemId, itemName, itemDescription FROM Items;

use xpskakklub;
#create()
#INSERT INTO Members (Members.name, gender, phone, email, birthday) VALUES ("?", '?', "?", "?", "?");

#fetchAll()
SELECT name, gender, phone, email, birthday FROM Members;

#delete();
DELETE FROM Members where email='bob@gmail.com';