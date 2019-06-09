SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "qtxmlpatterns \
            syntax-highlighting \
            karchive \
            kconfig \
            kconfig-native \
            kcoreaddons-native \
            kauth-native \
            kguiaddons \
            ki18n \
            kio \
            kparts \
            sonnet \
            sonnet-native \
            libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c9d404b2bd8aebe28d625aebb44d23a"
SRC_URI[sha256sum] = "7325eb0e32d36417cffd3d566aef60083fd884f403f23f88823eecc19e255a6f"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_PLUGINS} \
"
