SUMMARY = "Libkdcraw is a C++ interface around LibRaw library"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps

DEPENDS += "\
    libraw \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "62942d392519e86e880e5c5b0dc1bda124f245380546299536d755f4eb12a8a5"
