SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative kconfig kconfig-native ki18n kiconthemes kio kwidgetsaddons \
            kwindowsystem kglobalaccel kguiaddons kpackage libepoxy gettext-native \
            kcoreaddons-native kauth-native kpackage-native"

SRC_URI += "file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "16214091286562cdd2dbcf3a00be599b"
SRC_URI[sha256sum] = "0c6d9cea0b977d5d2fb65cc9ac620724602ee4c9fccd7152fe9360333a072283"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/.debug \
"
