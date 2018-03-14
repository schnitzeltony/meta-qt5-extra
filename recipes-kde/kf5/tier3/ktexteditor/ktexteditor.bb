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
SRC_URI[md5sum] = "22a6e36d531066b51020d13e4a29f4ef"
SRC_URI[sha256sum] = "96a50ff4433f1a1060cf81d9538305d546356440df77bf59dbd3ddd1952e1bbc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/parts/.debug \
"
