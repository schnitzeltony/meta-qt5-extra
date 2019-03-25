OE layer to desktop environments based on Qt5

Layer dependencies:
----------------------
see conf/layer.conf


URI: git://git.openembedded.org/openembedded-core
branch: master
revision: HEAD

URI: git://github.com/meta-qt5/meta-qt5.git
branch: master
revision: HEAD

URI: git://git.openembedded.org/meta-openembedded
branch: master
revision: HEAD


Contributing
------------
* Submit any patches against the `meta-qt5-extra` layer by using the GitHub pull-request feature.


Policies
--------
* Please do not send private emails to maintainers. For questions/suggestions.. use GitHub issues.
* Pull requests should follow [1] with the following additions
  * Use 4 spaces for indention always
  * For splitting of long list values use four-space indentation on sucessive lines and prefer the closing quote as the first character ([1] second example)
  * Patches fixing issues for musl, clang or gold-linker are accepeted only with upstream-status "Applied" or "Backport"


Maintainers
-----------

Layer maintainer: Andreas Müller <schnitzeltony@gmail.com>



[1] https://www.openembedded.org/wiki/Styleguide
