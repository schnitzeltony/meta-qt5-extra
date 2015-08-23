inherit kde-base

KDE_APP_VERSION = "15.08.0"

SRC_URI = "http://download.kde.org/stable/applications/${KDE_APP_VERSION}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"
