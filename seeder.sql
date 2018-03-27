use fad_db;

INSERT INTO users (name, email, password, created_at, updated_at)
VALUES ('Bobby Bob', 'bobby@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Sally Smith', 'sally@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Karen Schultz', 'karen@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Fred White', 'fred@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Bud Gibson', 'bud@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW());

INSERT INTO fads (user_id, title, description, img_url, passe, created_at, updated_at)
VALUES

(1, 'Dabbing', 'Dabbing, or the dab, is a simple dance move in which a person drops the head into the bent crook of a slanted arm, often while raising the opposite arm in a parallel direction but out straight. Since 2015, it has also been used as a gesture of triumph or playfulness, becoming a youthful American dance fad and Internet meme.[1] The move looks similar to someone sneezing into the "inside" of their elbow.. - (https://en.wikipedia.org/wiki/Dab_(dance))', '/img/dab-corn.jpg', false, NOW(), NOW()),

(2, 'Super Soakers', 'Super Soaker is a brand of recreational water gun that utilizes manually-pressurized air to shoot water with greater power, range, and accuracy than conventional squirt pistols. The Super Soaker was invented in 1982 by engineer Lonnie Johnson. The prototype combined PVC pipe, acrylic glass, and an empty plastic soda bottle. - (https://en.wikipedia.org/wiki/Super_Soaker)', '/img/supersoaker.png', true, NOW(), NOW()),

(2, 'Pogs', 'Pogs, generically called milk caps, is a game that was popular among children during the mid 1990s. - (https://en.wikipedia.org/wiki/Milk_caps_(game))', '/img/pogs.jpg', true, NOW(), NOW()),

(4, 'Spinners', 'A fidget spinner is a toy that consists of a ball bearing in the center of a multi-lobed (typically two or three) flat structure made from metal or plastic designed to spin along its axis with little effort. Fidget spinners became popular toys in April 2017, although similar devices had been invented as early as 1993. - (https://en.wikipedia.org/wiki/Fidget_spinner)', '/img/spinner.jpg', true, NOW(), NOW()),

(1, 'The Word "Tubular"', 'Surfing (particularly in Southern California) has its own sociolect, which has comingled with Valleyspeak. Words such as "dude", "tubular", "radical", and "gnarly" are associated with both and Northern California created its own unique surf terms as well that include "groovy", "hella", and "tight". - (https://en.wikipedia.org/wiki/Surf_culture#Surf_terminology)', '/img/tubular.jpg', true, NOW(), NOW()),

(4, 'Surge', 'Surge (sometimes styled as SURGE) is a citrus flavored soft drink first produced in the 1990s by The Coca-Cola Company to compete with Pepsi''s Mountain Dew. - (https://en.wikipedia.org/wiki/Surge_(drink))', '/img/surge.jpg', true, NOW(), NOW()),

(1, 'The Nintendo 64', 'The Nintendo 64 (Japanese: ニンテンドウ64 Hepburn: Nintendō Rokujūyon), stylized as NINTENDO64 and abbreviated to N64, is Nintendo''s third home video game console for the international market. Named for its 64-bit central processing unit, it was released in June 1996 in Japan, September 1996 in North America and Brazil, March 1997 in Europe and Australia, September 1997 in France. - (https://en.wikipedia.org/wiki/Nintendo_64)', '/img/n64.jpg', true, NOW(), NOW()),

(4, 'Pagers', 'A pager (also known as a beeper) is a wireless telecommunications device that receives and displays alphanumeric messages and/or receives and announces voice messages. One-way pagers can only receive messages, while response pagers and two-way pagers can also acknowledge, reply to, and originate messages using an internal transmitter. - (https://en.wikipedia.org/wiki/Pager)', '/img/pager.jpg', true, NOW(), NOW()),

(1, 'MySpace', 'Myspace is a social networking website offering an interactive, user-submitted network of friends, personal profiles, blogs, groups, photos, music, and videos. It is headquartered in Beverly Hills, California. - (https://en.wikipedia.org/wiki/Myspace)', '/img/myspace.jpg', true, NOW(), NOW()),

(4, 'Atkins Diet', 'The Atkins diet, also known as the Atkins nutritional approach, is a commercial weight-loss program devised by Robert Atkins. The Atkins diet is classified as a low-carbohydrate fad diet.[1] The diet is marketed with questionable claims that carbohydrate restriction is critical to weight loss.[2] There is no good evidence of the diet''s effectiveness in achieving weight loss. - (https://en.wikipedia.org/wiki/Atkins_diet)', '/img/atkins.png', true, NOW(), NOW()),

(4, 'Y2K', 'The Year 2000 problem, also known as the Y2K problem, the Millennium bug, the Y2K bug, or Y2K, is a class of computer bugs related to the formatting and storage of calendar data for dates beginning in the year 2000. - (https://en.wikipedia.org/wiki/Year_2000_problem)', '/img/y2k.jpg', true, NOW(), NOW()),

(1, 'Flare Jeans', 'In 1996, women''s bell-bottoms were reintroduced to the mainstream public, under the name "boot-cut" ("boot-fit") trousers as the flare was slimmer.[8] By 1999, flare jeans had come into vogue among women,[9] which had a wider, more exaggerated flare than boot-cuts (boot-fits). The boot-cut (boot-fit) style ended up dominating the fashion world for 10 years. - (https://en.wikipedia.org/wiki/Bell-bottoms)', '/img/flares.jpg', true, NOW(), NOW()),

(4, 'Boy Bands', 'A boy band (or boyband) is loosely defined as a vocal group consisting of young male singers, usually in their teenage years or in their twenties at the time of formation,[1] singing love songs marketed towards young women. Being vocal groups, most boy band members do not play musical instruments, either in recording sessions or on stage, making the term something of a misnomer. However, exceptions do exist. Many boy bands dance as well as sing, usually giving highly choreographed performances. - (https://en.wikipedia.org/wiki/Boy_band)
', '/img/boy-band.jpg', true, NOW(), NOW()),

(4, 'Crocs', 'Crocs, Inc. is a shoe manufacturer founded by Scott Seamans, Lyndon "Duke" Hanson, and George Boedecker, Jr. — to produce and distribute a foam clog[3] design acquired from a company called Foam Creations. The shoe was originally developed as a boating shoe. The first model produced by Crocs, the Beach, was unveiled in 2002 at the Fort Lauderdale Boat Show in Florida, and sold out the 200 pairs produced at that time.[4] It has since sold 300 million pairs of shoes. - (https://en.wikipedia.org/wiki/Crocs)', '/img/crocs.jpg', true, NOW(), NOW()),

(4, 'Tickle-Me-Elmo', 'Tickle Me Elmo is a children''s plush toy from Tyco Preschool, a division of Tyco Toys, of the Muppet character Elmo from the children''s television show, Sesame Street. When squeezed, Elmo shakes and vibrates. - (https://en.wikipedia.org/wiki/Tickle_Me_Elmo)', '/img/tickle.jpeg', true, NOW(), NOW()),

(1, 'Nu Metal', 'Nu metal (also known as nü-metal and aggro-metal) is a form of alternative metal that combines elements of heavy metal music with elements of other music genres such as hip hop, alternative rock, funk, industrial and grunge. Nu metal bands have drawn elements and influences from a variety of musical styles, including multiple genres of heavy metal. - (https://en.wikipedia.org/wiki/Nu_metal)
', '/img/nu-metal.jpg', true, NOW(), NOW());
