require greenisland.inc

FILESEXTRAPATHS =. "${FILE_DIRNAME}/${PN}:"

inherit native

DEPENDS += " \
    qtbase-native \
"

SRC_URI += " \
    file://0001-reduce-build-to-waylandscanner-for-native-build.patch \
"
