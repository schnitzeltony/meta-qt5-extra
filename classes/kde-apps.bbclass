inherit kde-base

KDE_APP_VERSION = "15.08.3"

SRC_URI = "http://download.kde.org/stable/applications/${PV}/src/${BPN}-${PV}.tar.xz"

RRECOMMENDS_${PN} += "qtbase-plugins"
