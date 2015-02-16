require ${BPN}.inc 

inherit native

SRC_URI += " \
    file://0002-CMakeLists.txt-do-not-search-for-libintl-gettext.patch \
    file://0003-do-not-install-po-files-for-native-build.patch \
"

EXTRA_OECMAKE += "-DBUILD_WITH_QTSCRIPT=OFF"

