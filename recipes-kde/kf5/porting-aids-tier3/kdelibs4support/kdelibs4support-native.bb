require ${BPN}.inc

inherit native

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    ki18n-native \
"

SRC_URI += " \
	file://0003-only-build-kf5-config-for-native.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
