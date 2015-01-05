require ${BPN}.inc 

inherit native

DEPENDS += "qtscript-native"

SRC_URI += "file://0002-CMakeLists.txt-do-not-search-for-libintl-gettext.patch"

