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
SRC_URI[md5sum] = "5f491d1b51cbafefff0d502c2818a1c9"
SRC_URI[sha256sum] = "ed713c0b05565d4626e53f030e0818449b35592382e76d705a4a6e19f53ba493"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
