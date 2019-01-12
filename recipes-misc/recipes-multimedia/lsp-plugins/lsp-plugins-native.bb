require ${BPN}.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}-native:"

inherit native

DEPENDS += " \
    php-native \
    lv2-native \
    libsndfile1-native \
"

SRC_URI+= "file://0001-Adjust-native-build.patch"

EXTRA_OEMAKE += " \
    BUILD_PLATFORM=Linux \
    PREFIX=${prefix} \
"

do_compile_prepend() {
    export BUILD_MODULES="src"
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/.build/*.exe ${D}${bindir}
}

