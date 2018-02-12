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
SRC_URI[md5sum] = "3ea63f69a4ed61c57b0578bc12c25606"
SRC_URI[sha256sum] = "4f75c1f546afd97207bf5eb1d85eb624b28d374da3b8c4ce95720b2d810f1ce6"

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
