require ${BPN}.inc

inherit native

DEPENDS += " \
    intltool-native \
    libsm-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n-native \
    liburi-perl-native \
"

SRC_URI += " \
	file://0003-only-build-kf5-config-for-native.patch \
"
