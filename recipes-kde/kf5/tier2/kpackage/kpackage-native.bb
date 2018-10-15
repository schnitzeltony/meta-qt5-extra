require ${BPN}.inc

inherit native

DEPENDS += "karchive-native ki18n-native kcoreaddons-native kconfig-native"

SRC_URI += "file://0001-Do-not-build-po-files-on-native-build.patch"
