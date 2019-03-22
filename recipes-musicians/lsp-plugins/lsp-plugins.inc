SUMMARY = "LSP (Linux Studio Plugins) is a collection of open-source plugins"
HOMEPAGE = "http://lsp-plug.in/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/sadko4u/lsp-plugins.git"
SRCREV = "1d41a52f6b2236f38670c2d3a28ab97c419a4754"
S = "${WORKDIR}/git"
PV = "1.1.5"

do_configure[noexec] = "1"
