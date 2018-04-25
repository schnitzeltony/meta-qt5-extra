require ${BPN}.inc 

inherit native

SRC_URI += " \
    file://0001-do-not-install-po-files-for-native-build.patch \
    file://0002-Do-not-force-my-native-depends-to-find-gettext.patch \
"

EXTRA_OECMAKE += "-DBUILD_WITH_QTSCRIPT=OFF -DBUILD_TESTING=OFF"
