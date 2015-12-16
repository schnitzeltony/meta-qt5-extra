require ${BPN}.inc 

inherit native

SRC_URI += " \
    file://0001-CMakeLists.txt-do-not-search-for-libintl-gettext.patch \
    file://0002-do-not-install-po-files-for-native-build.patch \
    file://0003-avoid-autotests.patch \
"

EXTRA_OECMAKE += "-DBUILD_WITH_QTSCRIPT=OFF"

