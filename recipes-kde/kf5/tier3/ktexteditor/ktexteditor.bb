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
SRC_URI[md5sum] = "793536fc793e2f9333b95c6aad999abb"
SRC_URI[sha256sum] = "3c3428032b16ba1995d987a5a5a8ea70d0dc78991cb6d47be199a572bc16cb3f"

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
