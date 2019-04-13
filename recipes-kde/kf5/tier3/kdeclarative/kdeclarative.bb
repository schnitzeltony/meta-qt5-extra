SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative kconfig kconfig-native ki18n kiconthemes kio kwidgetsaddons \
            kwindowsystem kglobalaccel kguiaddons kpackage libepoxy gettext-native \
            kcoreaddons-native kauth-native kpackage-native"

SRC_URI += " \
    file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch \
    file://0002-Use-QML-debugger-only-if-qtdeclarative-was-build-wit.patch \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a9af38c4d6f819cd71006c5e58ef7da3"
SRC_URI[sha256sum] = "5335b39ac1cca34209c0420dab867b67ddb0e9ee483bdd6d4192269a1d5f654f"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
