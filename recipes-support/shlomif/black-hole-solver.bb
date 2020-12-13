SUMMARY = "Black Hole Solitaire Solver"
HOMEPAGE = "https://www.shlomifish.org/open-source/projects/black-hole-solitaire-solver/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fc58d2aac176b30cdf4e19d406da414a"

SRC_URI = "https://fc-solve.shlomifish.org/downloads/fc-solve/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "36e1953a99e02e82489a3cb109fb590bcab307b4ddaec34cb0e67347668511e2"
PV = "1.10.1"

inherit cmake perlnative

DEPENDS += " \
    perl-path-tiny-native \
    rinutils \
"

# was: 'probably-redundant RPATH /usr/lib' - not exactly a bad breaker. Looked
# into but could't find why this is thrown - so ignore for now.
INSANE_SKIP_${PN} = "useless-rpaths"
