SUMMARY = "Computer-aided translation"
LICENSE = "BSD-3-Clause & GFDL-1.2-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    qtscript \
    hunspell \
	\
    kauth-native \
    ki18n \
    kio \
    kxmlgui \
    knotifications \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kross \
    sonnet-native \
    kdbusaddons \
    kcrash \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "8083a6e746bb087a1164757d3a90e42b20fde905835e94463e5261cbe61ad9e4"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS:${PN} += "translate-toolkit"
